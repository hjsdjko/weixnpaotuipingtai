const base = {
    get() {
        return {
            url : "http://localhost:8080/weixnpaotuipingtai/",
            name: "weixnpaotuipingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/weixnpaotuipingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序跑腿平台"
        } 
    }
}
export default base
