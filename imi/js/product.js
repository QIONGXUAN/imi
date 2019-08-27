/**
 * 商品详情页图片轮播
 * @param path 图片路径
 */

$(function () {
    let CART_URL = BASE_URL + "/product";
    $.get(CART_URL, function (result) {
        if (result != null && result.status === 200) {
            let $main = $(".J_sliderView");
            let template = function img_banner(path){
                (result.data);
            $main.after(template);
            init()
        }
    }, 'json');

function img_banner(path){


    let b1 = '<img data-src="/imi-single/pms_1562056107.03295989.jpg" class="slider done" ' +
        'src="/imi-single/pms_1562056107.03295989.jpg" ' +
        'style="float: none; list-style: none; position: absolute; width: 560px; z-index: 0; display: none;">';

}