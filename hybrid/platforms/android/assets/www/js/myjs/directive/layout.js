'use strict'

angular.module("app").directive('appLayout',function(){
return{
restrict:'E',
scope:{},
templateUrl:'js/myjs/template/layout.html',
controller:'layoutCtrl'
}
});