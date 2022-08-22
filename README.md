(JAVA)微信公众号推送早安问候以及天气预报

![效果实例](https://foruda.gitee.com/images/1661114032200050862/1.png "1.png")

教程

1.注册微信测试账号，编辑模板
https://mp.weixin.qq.com/debug/cgi-bin/sandbox?t=sandbox/login

![微信测试平台]

扫码关注得到用户的id


编辑模板
![输入图片说明]

示例`{{riqi.DATA}} {{beizhu.DATA}} 天气：{{tianqi.DATA}} 最低气温：{{low.DATA}}度 最高气温：{{high.DATA}}度 今天是我们恋爱的第{{lianai.DATA}}天 距离??的生日还有{{shengri.DATA}}天 {{caihongpi.DATA}} {{jinju.DATA}}`

2.spring boot 开发，对接第三方
过于简单，不予展示

3.百度地图开放平台
https://lbsyun.baidu.com/apiconsole/center#/home

创建应用并提交


4.彩虹屁平台
https://www.tianapi.com/

首页彩虹屁申请(免费)


5.代码环节略过，直接下载

6.打包上传服务器 


cd到jar目录下
nohup java -jar xxx.jar >xxx.txt &
后边的txt是日志输出目录，跑不起来就点进去看看日志
什么？ 看不懂？ 解决方法如下
https://fanyi.youdao.com/
https://fanyi.baidu.com/
