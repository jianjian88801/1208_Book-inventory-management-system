import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shangpintuihuo from '@/views/modules/shangpintuihuo/list'
    import gongyingshang from '@/views/modules/gongyingshang/list'
    import shourujine from '@/views/modules/shourujine/list'
    import kucunfenxi from '@/views/modules/kucunfenxi/list'
    import tushuleixing from '@/views/modules/tushuleixing/list'
    import kehuxinxi from '@/views/modules/kehuxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import yingshoujine from '@/views/modules/yingshoujine/list'
    import discusstushuxinxi from '@/views/modules/discusstushuxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import pixiaodingdan from '@/views/modules/pixiaodingdan/list'
    import jinhuodingdan from '@/views/modules/jinhuodingdan/list'
    import config from '@/views/modules/config/list'
    import tushuxinxi from '@/views/modules/tushuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/shangpintuihuo',
        name: '商品退货',
        component: shangpintuihuo
      }
      ,{
	path: '/gongyingshang',
        name: '供应商',
        component: gongyingshang
      }
      ,{
	path: '/shourujine',
        name: '收入金额',
        component: shourujine
      }
      ,{
	path: '/kucunfenxi',
        name: '库存分析',
        component: kucunfenxi
      }
      ,{
	path: '/tushuleixing',
        name: '图书类型',
        component: tushuleixing
      }
      ,{
	path: '/kehuxinxi',
        name: '客户信息',
        component: kehuxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/yingshoujine',
        name: '应收金额',
        component: yingshoujine
      }
      ,{
	path: '/discusstushuxinxi',
        name: '图书信息评论',
        component: discusstushuxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/pixiaodingdan',
        name: '批销订单',
        component: pixiaodingdan
      }
      ,{
	path: '/jinhuodingdan',
        name: '进货订单',
        component: jinhuodingdan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/tushuxinxi',
        name: '图书信息',
        component: tushuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
