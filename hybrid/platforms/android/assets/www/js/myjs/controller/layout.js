'use strict'

angular.module("app").controller('layoutCtrl', function($scope, $state) {
	$scope.textButton = function() {
		alertDialog.showMsg(null,function(data) {
			alert('js:js插件调用成功，此时在controller中'+data);
		}, function(data) {
			alert(data);
		});
	}
})