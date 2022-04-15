const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot60bhk/",
            name: "springboot60bhk",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot60bhk/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "水资源管理系统"
        } 
    }
}
export default base
