cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [{
	"file":"plugins/customdialog/dialog.js", //js文件路径
	"id":"cordova-plugin-dialog.CustomDialog",     //js    cordova.define 的id
	"clobbers": [
            "alertDialog"//js 调用时类名
        ]
}];
module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-whitelist": "1.3.0"
};
// BOTTOM OF METADATA
});