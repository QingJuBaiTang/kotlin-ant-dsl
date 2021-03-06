# Kotlin Ant DSL

[![Build Status](https://travis-ci.org/DevCharly/kotlin-ant-dsl.svg?branch=master)](https://travis-ci.org/DevCharly/kotlin-ant-dsl)
[![Download](https://api.bintray.com/packages/devcharly/maven/kotlin-ant-dsl/images/download.svg) ](https://bintray.com/devcharly/maven/kotlin-ant-dsl/_latestVersion)

Kotlin Ant DSL allows using [Ant] tasks from Kotlin.

```kotlin
Ant {
    echo("Hello World")
    mkdir("dir1")
    copy(todir = "dir1") {
        fileset(dir = "dir2")
            include(name = "**/*.txt")
        }
    }
}
```

[Examples](examples/src/demo.kt)


Define a function to use a custom Ant task:

```kotlin
fun Ant.myanttask(attr1: String, attr2: String) {
    MyAntTask().execute("myanttask") { task ->
        task.setAttr1(attr1)
        task.setAttr2(attr2)
    }
}
```

Execute custom Ant Task:

```kotlin
Ant {
    myanttask("value1", "value2")
}
```


## Supported Ant features

### Tasks

  * [bunzip2](http://ant.apache.org/manual/Tasks/unpack.html)
  * [bzip2](http://ant.apache.org/manual/Tasks/pack.html)
  * [checksum](http://ant.apache.org/manual/Tasks/checksum.html)
  * [chgrp](http://ant.apache.org/manual/Tasks/chgrp.html)
  * [chmod](http://ant.apache.org/manual/Tasks/chmod.html)
  * [chown](http://ant.apache.org/manual/Tasks/chown.html)
  * [copy](http://ant.apache.org/manual/Tasks/copy.html)
  * [delete](http://ant.apache.org/manual/Tasks/delete.html)
  * [echo](http://ant.apache.org/manual/Tasks/echo.html)
  * [exec](http://ant.apache.org/manual/Tasks/exec.html)
  * [fixcrlf](http://ant.apache.org/manual/Tasks/fixcrlf.html)
  * [gunzip](http://ant.apache.org/manual/Tasks/unpack.html)
  * [gzip](http://ant.apache.org/manual/Tasks/pack.html)
  * [jar](http://ant.apache.org/manual/Tasks/jar.html)
  * [java](http://ant.apache.org/manual/Tasks/java.html)
  * [javac](http://ant.apache.org/manual/Tasks/javac.html)
  * [javadoc](http://ant.apache.org/manual/Tasks/javadoc.html)
  * [manifest](http://ant.apache.org/manual/Tasks/manifest.html)
  * [manifestclasspath](http://ant.apache.org/manual/Tasks/manifestclasspath.html)
  * [mkdir](http://ant.apache.org/manual/Tasks/mkdir.html)
  * [move](http://ant.apache.org/manual/Tasks/move.html)
  * [property](http://ant.apache.org/manual/Tasks/property.html)
  * [record](http://ant.apache.org/manual/Tasks/recorder.html)
  * [replace](http://ant.apache.org/manual/Tasks/replace.html)
  * [replaceregexp](http://ant.apache.org/manual/Tasks/replaceregexp.html)
  * [tar](http://ant.apache.org/manual/Tasks/tar.html)
  * [touch](http://ant.apache.org/manual/Tasks/touch.html)
  * [unjar](http://ant.apache.org/manual/Tasks/unzip.html)
  * [untar](http://ant.apache.org/manual/Tasks/unzip.html)
  * [unwar](http://ant.apache.org/manual/Tasks/unzip.html)
  * [unzip](http://ant.apache.org/manual/Tasks/unzip.html)
  * [zip](http://ant.apache.org/manual/Tasks/zip.html)

### Types

  * [DirSet](http://ant.apache.org/manual/Types/dirset.html)
  * [FileList](http://ant.apache.org/manual/Types/filelist.html)
  * [FileSet](http://ant.apache.org/manual/Types/fileset.html)
  * [MultiRootFileSet](http://ant.apache.org/manual/Types/multirootfileset.html)
  * [Path-like Structures](http://ant.apache.org/manual/using.html#path)
  * [Permissions](http://ant.apache.org/manual/Types/permissions.html)
  * [PatternSet](http://ant.apache.org/manual/Types/patternset.html)
  * [Regexp](http://ant.apache.org/manual/Types/regexp.html)
  * [Selectors](http://ant.apache.org/manual/Types/selectors.html)
  * [TarFileSet](http://ant.apache.org/manual/Types/tarfileset.html)
  * [ZipFileSet](http://ant.apache.org/manual/Types/zipfileset.html)


## Converter

The [Converter](converter/src/main/kotlin/com/devcharly/kotlin/ant/converter/Main.kt)
converts Ant XML files to Kotlin Ant DSL.
Note that Kotlin Ant DSL does not support some Ant tags (e.g. `<project>` and `<target>`).
So you can not compile/run the output, but you can copy the parts that you need.
The primary goal is support migration of Ant builds to Kotlin based build systems (e.g. [Kobalt])


## Generator

The Kotlin code for the Ant tasks DSL is generated.
See [generator](generator/src/main/kotlin/com/devcharly/kotlin/ant/generator).
If you miss some tasks, you can add them to
[generator/Main.kt](generator/src/main/kotlin/com/devcharly/kotlin/ant/generator/Main.kt)
and use `./kobaltw generator:run` to generate the DSL.
Then use `./kobaltw assemble` to compile the DSL.


## Who uses Kotlin Ant DSL?

  * [Kobalt build system Ant plug-in](https://github.com/DevCharly/kobalt-ant)


## Download

[![Download](https://api.bintray.com/packages/devcharly/maven/kotlin-ant-dsl/images/download.svg) ](https://bintray.com/devcharly/maven/kotlin-ant-dsl/_latestVersion)

For Maven, Gradle or Kobalt use:

    Repository: jcenter (or https://dl.bintray.com/devcharly/maven/) 
    Group:      com.devcharly
    Artifact:   kotlin-ant-dsl
    Version:    (latest)


## Requirements

Ant 1.9.7 or later


[Ant]: http://ant.apache.org/
[Ant tasks]: http://ant.apache.org/manual/tasksoverview.html
[Kobalt]: https://github.com/cbeust/kobalt
