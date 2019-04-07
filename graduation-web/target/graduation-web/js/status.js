if($.cookie("token") == null){
    alert("请先登录");
    window.location.href="login.html";
}