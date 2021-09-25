// 请求地址前缀 
const baseUrl = 'http://localhost:7777/';
const SUCCESS_CODE = 1001;
//绑定ajax全局事件  统一处理等待图标事件
let layerId;
$(document).ajaxStart(function(){
	layerId = layer.load(1);
});
$(document).ajaxSuccess(function(){
	layer.close(layerId);
});
$(document).ajaxError(function(){
	layer.close(layerId);
});
//从网页url中提取参数函数
function getParam(key){//
	let url = location.href;
	
	let step1 = url.split('?');
	
	if(step1.length < 2){
		return null;
	}
	
	step1 = step1[1];
	
	let step2 = step1.split('&');
	
	for(let i = 0 ; i < step2.length; i ++){
		let strs = step2[i].split('=');
		if(strs[0] == key){
			return strs[1];
		}
	}
	return null;
}
