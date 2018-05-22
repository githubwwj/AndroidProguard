# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
#-keepclasseswithmembers  class xjyz.proguard.domain.* {*;}
# 不混淆domain包
#-keepclasseswithmembers class  xjyz.proguard.domain.* {
#  *;
#}

#如果Student用不用，直接删除文件
-keepclassmembers class xjyz.proguard.domain.Student { *;}

#Student不用，不会混淆也不会删除文件
-keepclasseswithmembers class xjyz.proguard.domain.Student { *;}
