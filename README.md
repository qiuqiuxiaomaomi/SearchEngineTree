# SearchEngineTree

搜索引擎的技术架构

![](https://i.imgur.com/A36P224.jpg)

<pre>
搜索引擎及技术架构
    1）史前时代：分类目录的一代
       分类目录的一代，如yahoo, hao123
	2）第一代：文本检索的一代
	3）连接分析的一代
       率先提出并使用PageRank链接分析算法
	5）用户中心的一代
</pre>

通用爬虫架构

![](https://i.imgur.com/4VktTuf.jpg)

![](https://i.imgur.com/39poKGB.jpg)

分布式爬虫

![](https://i.imgur.com/lShlacI.jpg)

主从式分布式爬虫

![](https://i.imgur.com/FLYey3R.jpg)

对等式分布式爬虫

![](https://i.imgur.com/pFBGShk.jpg)

<pre>
网络爬虫
     首先从互联网中精心选择一部分网页，以这些网页的链接地址作为种子URL，将这些种子URL放入待抓取URL队列中，爬虫从待抓取URL队列依次读取，并将URL通过DNS解析，把链接地址
     转换为网站服务器对应的IP地址。然后将其和网页相对路径名称交给网页下载器，网页下载器负责页面内容的下载，对于下载到本地的网页，一方面将其存储到页面库中，等待建立索引等后续处理，另一方面将下载网页的URL放入已抓取URL队列中，这个队列记载了爬虫系统已经下载过的网页URL，以避免网页的重复抓取，对于刚下载的网页，从中抽取出所包含的所有链接信息，并在已抓取URL队列中检查，如果发现链接没有被抓取过，则将这个URL放入待抓取队列末尾，在之后的抓取调度中会下载这个URL对应的网页。如此这般，形成循环，知道待抓取URL队列为空。

     爬虫分类：
      1）批量爬虫
	  2）增量型爬虫
	     应对互联网网页的频繁更新
	  3）垂直型爬虫

    1）通用爬虫框架
	2）抓取策略
       1）宽度优先遍历
       2）非完全PageRank策略
       3）OPIC策略
       5）大站优先策略 
    3）网页更新策略
       1）历史参考策略
       2）用户体验策略
       3）聚类抽样策略

	5）暗网抓取(抓取数据库中的数据)
       Google
       百度的阿拉丁计划

	6）分布式爬虫
</pre>

单次-文档矩阵

![](https://i.imgur.com/p2KGu4S.jpg)

![](https://i.imgur.com/ps6xrVz.jpg)
	
<pre>
搜索引擎索引
    1）索引基础
         1）文档
         2）文档集合
         3）文档编号
         5）单次编号
         6）倒排索引（是实现单次文档矩阵的一种具体存储形式）
         7）单次词典
         8）倒排列表
         9）倒排文件 

	2）单次词典
         单次词典是倒排索引中非常重要的组成部分，它用来维护文档集合中出现过的所有单词的相关信息，同时用来记录某个单次对应的倒排列表在倒排文件中的位置信息。在支持搜索时，根据
         用户的查询次，去单次词典里查询，就能够获得相应的倒排列表，并以此作为后续排序的基础

         1）hash + 链表
         2）B树形结构

	3）倒排列表
	5）建立索引
	6）动态索引
	7）索引更新策略
       1）完全重建策略
       2）再合并策略
       3）原地更新策略
       5）混合策略

	8）查询处理
	9）多字段索引
	10）短语查询
	11）分布式索引
</pre>

<pre>
索引压缩
    1）词典压缩
    2）倒排列表压缩算法
    3）文档编号重排序
    5）静态索引裁剪	

检索模型与搜索排序
    1）布尔模型
	2）向量空间模型
	3）概率检索模型
	5）语言模型
	6）机器学习排序
	7）检索质量与评价体系

连接分析
    1）Web图
	2）两个概念模型及算法之间的关系
	3）PageRank算法
	5）HITS算法
	6）SALSA算法
	7）主题敏感PAGERANK
	8）Hilltop算法
	9）其他改进算法

云存储与云计算
    1）云存储与云计算概念
	2）Google文件系统
	3）Chubby锁服务
	5）Bigtable

网页反作弊
    1）内容作弊
	2）网页隐藏作弊
	3）Web2.0作弊方法
	5）反作弊技术的整体思路
	6）通用链接反作弊方法
	7）专用链反作弊技术
	8）识别内容作弊
	9）反隐藏作弊
	10）搜索引擎反作弊综合框架

用户查询意图分析
    1）搜索行为及意图
	2）搜索日志挖掘
	3）相关搜索
	5）查询纠错

网页去重
    1）通用去重算法框架
	2）ShingLing算法
	3）I-Match算法
	5）SimHash算法
	6）SpotSig算法

搜索引擎缓存机制
    1）搜索引擎缓存系统架构
	2）缓存对象
	3）缓存结构
	5）缓存淘汰策略
	6）缓存更新策略

搜索引擎发展趋势
    1）个性化搜索
	2）社会化搜索
	3）实时搜索
	5）移动搜索
	6）地理位置感知搜索
	7）跨语言搜索
	8）多媒体搜索
	9）情境搜索
</pre>

倒排索引

![](https://i.imgur.com/AxZd8q6.png)

<pre>
Lucene
      Lucene是一套用于全文检索和搜寻的开源程序库，由Apache基金会支持和提供。Lucene提供
    了一个简单却功能强大的应用程序接口，能够做全文索引和搜寻。在Java开发环境里Lucene是一个
    成熟且免费的开源工具。

    全文检索原理：
           何为全文检索？现在要在一个文件中查找某个字符串，最直接的想法就是从头开始检索，
        查到了就OK，这种对于小数据量的文件，很实用，但是对于大数据量的文件来说，如果在一个
        拥有几十个G的硬盘中找效率可想而知，是很低的。

           文件中的数据是属于非结构化数据，也就是说它没有什么结构可言的，要解决上述提到的
        效率问题，首先我们得即将非结构化数据中的一部分信息提取出来，重新组织，使其变得有
        一定结构，然后对此有一定结构的数据进行搜索，从而达到搜索相对较快的目的，这就是全文
        搜索，即先建立索引，再对索引进行搜索的过程。

        Lucene如何建立索引
            第一步：
                  将文档传给分词组件，分词组件会将文档分成一个个单次，并去除标点符号和
               停用词，所谓的停用词指的是没有特别意义的词，比如英文字符 a, the, too等，
               经过分词后，得到词元token。

            第二步：
                  将词元传给语言处理组件，对于英语，语言处理组件一半会将字母变为小写，将
               单词缩减为词根形式，如"lives"到"live"等，将单词转变为词根形式，如"drove"
               到"drive"等，然后得到词"Term"

            第三步：
                  将得到的词传给索引组件（Indexer），索引组件经过处理，得到下面的索引结构

        以上就是Lucene索引结构最核心的部分。它的关键字是按字符顺序排列的，因此Lucene可以用
        二元搜索算法快速定位关键词。实现时,Lucene将上面三列分别作为
            词典文件（Term Dictionary），
            频率文件(frequencies)，
            位置文件(positions)
        保存.其中词典文件不仅保存有每个关键词，还保留了指向评率文件和位置文件的指针，通过
        指针可以找到该关键字的频率信息和位置信息。

            搜索的过程是先对词典二元查找，找到该词，通过指向频率文件的指针独处所有文章号，
        然后返回结果，然后就可以在具体的文章中根据出现的位置找到该词了。所以Lucene在第一次
        建立索引的时候可能会比较慢，但是以后就不需要每次都建立索引了，就快了。当然了，这是
        针对英文的检索，针对中文的规则会有不同。

        英文分词器：
            标准分词器
        中文分词器：
            例如
               smartcn中文分词器
</pre>