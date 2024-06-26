const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootk6oce/",
            name: "springbootk6oce",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootk6oce/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "图书进销存管理系统"
        } 
    }
}
export default base
