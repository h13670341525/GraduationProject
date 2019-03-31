package com.dhu.helper;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 黄朝胜
 * @Title: JwtHelper
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/3118:46
 */
public class JwtHelper {

    /*
     *   过期时间为30分钟
     */
    private static final long EXPIRE_TIME = 30 * 60 *60;

    /*
     *   token私钥
     */
    private static final String TOKEN_SECRET = "f26e587c28064d0e855e72c0a6a0e618";


    /*
     *  生成Token
     */
    public static String sign(String userid,int usertype){
        try{
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            Map<String, Object> header = new HashMap<String, Object>(2);
            header.put("typ", "JWT");
            header.put("alg", "HS256");
            return JWT.create().withHeader(header)
                    .withClaim("userid", userid)
                    .withClaim("usertype", usertype)
                    .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRE_TIME))
                    .sign(algorithm);
        }catch (Exception e){
           return null;
        }
    }

    public static boolean verify(String token){
        try{
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static String getUserid(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("userid").asString();
        }catch (Exception e){
            return null;
        }
    }

    public static Integer getUsertype(String token){
        try{
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("usertype").asInt();
        }catch (Exception e){
            return null;
        }
    }
}
