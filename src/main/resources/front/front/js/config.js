
var projectName = '图书进销存管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '进货订单',
	url: './pages/jinhuodingdan/list.html'
}, 
{
	name: '商品退货',
	url: './pages/shangpintuihuo/list.html'
}, 
{
	name: '批销订单',
	url: './pages/pixiaodingdan/list.html'
}, 
{
	name: '图书信息',
	url: './pages/tushuxinxi/list.html'
}, 
{
	name: '客户信息',
	url: './pages/kehuxinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springbootk6oce/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"图书类型","menuJump":"列表","tableName":"tushuleixing"}],"menu":"图书类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"进货订单","menuJump":"列表","tableName":"jinhuodingdan"}],"menu":"进货订单管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表","导出"],"menu":"商品退货","menuJump":"列表","tableName":"shangpintuihuo"}],"menu":"商品退货管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"批销订单","menuJump":"列表","tableName":"pixiaodingdan"}],"menu":"批销订单管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客户信息","menuJump":"列表","tableName":"kehuxinxi"}],"menu":"客户信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"供应商","menuJump":"列表","tableName":"gongyingshang"}],"menu":"供应商管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"库存分析","menuJump":"列表","tableName":"kucunfenxi"}],"menu":"库存分析管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"收入金额","menuJump":"列表","tableName":"shourujine"}],"menu":"收入金额管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"应收金额","menuJump":"列表","tableName":"yingshoujine"}],"menu":"应收金额管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"进货订单列表","menuJump":"列表","tableName":"jinhuodingdan"}],"menu":"进货订单模块"},{"child":[{"buttons":["查看"],"menu":"商品退货列表","menuJump":"列表","tableName":"shangpintuihuo"}],"menu":"商品退货模块"},{"child":[{"buttons":["查看"],"menu":"批销订单列表","menuJump":"列表","tableName":"pixiaodingdan"}],"menu":"批销订单模块"},{"child":[{"buttons":["查看"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"buttons":["查看"],"menu":"客户信息列表","menuJump":"列表","tableName":"kehuxinxi"}],"menu":"客户信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"图书类型","menuJump":"列表","tableName":"tushuleixing"}],"menu":"图书类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"进货订单","menuJump":"列表","tableName":"jinhuodingdan"}],"menu":"进货订单管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表","导出"],"menu":"商品退货","menuJump":"列表","tableName":"shangpintuihuo"}],"menu":"商品退货管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"批销订单","menuJump":"列表","tableName":"pixiaodingdan"}],"menu":"批销订单管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客户信息","menuJump":"列表","tableName":"kehuxinxi"}],"menu":"客户信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"供应商","menuJump":"列表","tableName":"gongyingshang"}],"menu":"供应商管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"库存分析","menuJump":"列表","tableName":"kucunfenxi"}],"menu":"库存分析管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"收入金额","menuJump":"列表","tableName":"shourujine"}],"menu":"收入金额管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"应收金额","menuJump":"列表","tableName":"yingshoujine"}],"menu":"应收金额管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"进货订单列表","menuJump":"列表","tableName":"jinhuodingdan"}],"menu":"进货订单模块"},{"child":[{"buttons":["查看"],"menu":"商品退货列表","menuJump":"列表","tableName":"shangpintuihuo"}],"menu":"商品退货模块"},{"child":[{"buttons":["查看"],"menu":"批销订单列表","menuJump":"列表","tableName":"pixiaodingdan"}],"menu":"批销订单模块"},{"child":[{"buttons":["查看"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"buttons":["查看"],"menu":"客户信息列表","menuJump":"列表","tableName":"kehuxinxi"}],"menu":"客户信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
