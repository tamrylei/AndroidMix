# Android相关的工具类集合 

## 关键代码来源：

[RxTool-2.6.2](https://github.com/Tamsiree/RxTool/tree/v2.6.2)

## 使用说明：

### Step 1.先在 build.gradle(Project:XXXX) 的 repositories 添加:

```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

### Step 2.然后在 build.gradle(Module:app) 的 dependencies 添加:

```gradle
dependencies {
  // RxTool 基础库
  implementation 'com.github.tamrylei.AndroidMix:RxKit:1.0.0'
  // RxTool UI库
  implementation 'com.github.tamrylei.AndroidMix:RxUI:1.0.0'
  // RxTool 功能库（Zxing扫描与生成二维码条形码）
  implementation 'com.google.zxing:core:3.4.1'
  implementation 'com.github.tamrylei.AndroidMix:RxFeature:1.0.0'
}
```

### Step 3.在Application中初始化

需要在Application中初始化
```
RxTool.init(this);
```
