---
title: Gson 源码
date: 2021-04-07 17:40:17
tags: [ 源码 ]

---

```groovy
implementation 'com.google.code.gson:gson:2.8.8'
```

## 概述

## 简介

支持基本类型、引用类型、数组和集合。

Java 泛型在序列化中的影响。

版本控制

`@SerializedName`

## 注意

不能序列化具有循环引用的对象，因为会导致无限递归。

## 总结



## 问题

Retrofit addJsonConverter

用到的设计模式？

序列化后，反序列化成对象时，类的结构改变了（多了字段或少了字段）有什么影响？

Gson 在配合 Kotlin 使用时的问题？

Gson 和 Moshi 的区别？

kotlin.serialization

## 参考

[Kotlin Json库问题总结（Gson以及Moshi的坑） - 掘金](https://juejin.cn/post/6969841959082917901#heading-10)

[Kotlinx.serialization VS Gson_移动端开发干货分享-CSDN博客](https://blog.csdn.net/vitaviva/article/details/105086016)