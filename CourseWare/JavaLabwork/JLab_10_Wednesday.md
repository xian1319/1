# 实验十 输入输出流

## 1. 实验目的

了解Java中流的概念，能够使用最为常见的字节流和字符流工具实现基本的输入输出功能

## 2. 编程完成以下实验任务

### 1. 字符串替换
编写一程序，实现对指定文本文件的操作，将文本中指定的字符串替换成目标字符串。程序运行时，指定文本文件、指定的字符串和目标字符串均作为程序运行参数获得。
如程序名为StringReplace，程序运行时有如下命令：

```
java StringReplace src.txt today tomorrow
```
将文本文件src.txt中所有的字符串"today"替换为"tomorrow"

### 2. 文件内容的二进制显示
编写一程序，读入任意类型的一个文件，将文件内容的二进制表示以文本形式存储在新的文本文件中。程序运行时带两个参数，第一个参数为文件名，第二个参数为新的文本文件名。
如程序名为BinaryToText，运行如下命令：
```
java BinaryToText src.dat srcBinary.txt
```
即能够将文件src.dat中每个字节的二进制表示以文本形式存储在新的文件srcBinary.txt中。如src.dat中存储的二进制内容为
```
H0 68 57 24 36 89
```
则在文本文件srcBinary.txt中存储的内容即为
```
H06857243689
```
查看文件内容的二进制表示，可利用文本编辑器的插件，如Notepad++，Sublime Text，Visual Code等主流编辑器均提供了插件实现此项功能。
请注意在提交作业时，请将测试用的二进制文件一并打包

### 3. 大文件分割
假设需要备份一大容量文件，比如一10G的视频文件，需将其分割成n个大小几乎相等的小文件。现请编写程序实现此功能。
其中，源文件名和待分割的文件数量可作为程序运行的参数
如运行命令
```
java FileSplit SourceFile 5
```
即将源文件SourceFile分割成5个部分，各部分分别命名为SourceFile.1, SourceFile.2, ..., SourceFile.5，并将各部分内容写入相应的文件中


