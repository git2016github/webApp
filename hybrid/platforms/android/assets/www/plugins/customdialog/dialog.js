cordova.define("cordova-plugin-dialog.CustomDialog",
    function(require, exports, module) {
        var exec = require("cordova/exec");


        module.exports = {
            showMsg: function(content,success,error){
            alert("进入原生方法")
                exec(success,error,"AppCustomDialog","showDialog",[content]);
                //success //成功的回调
                //error// 失败的回调
                //AppCustomDialog //对应安卓中config里面feature name。
                // "showDialog",//对应java代码插件类中action对应的值
                // [content]//要传递的参数，json格式
            }
        }
});

//cordova.define 的第一个参数就是cordova_plugins.js里面定义的id，最主要的是exec方法，参数说明： 
//参数1：成功回调function 
//参数2：失败回调function 
//参数3：feature name，与config.xml中注册的一致 
//参数4：调用java类时的action 
//参数5：要传递的参数，json格式