![](https://github.com/TutorialsAndroid/FilePicker/blob/master/sample/src/main/res/mipmap-xxhdpi/ic_launcher.png)


`Latest version of this library is migrated to androidx and Added partial Support to Android 14.`

### Screenshot

![](https://github.com/TutorialsAndroid/FilePicker/blob/master/screenshots/device-2019-05-10-182300.png)

### Features

* Easy to Implement.
* Files, Directory Selection.
* Single or Multiple File selection.

### Installation with JitPack 
*( IMPORTANT NOTE: WE HAVE STOPPED PUSHING LIBRARY TO JITPACK v9.0.1 is outdated now. SEE mavenCentral() below )*

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Foysalofficial:FilePickerWithLatestAndroid:14.0'
	}

### Installation with mavenCentral()
Step 1. Directly add the dependency in application build.gradle file:

    dependencies {
        implementation ("com.github.Foysalofficial:FilePickerWithLatestAndroid:14.0")
    }


### Important:
* `defaultValue`, `error_dir`, `root_dir`, `offset_dir` must have valid directory/file paths.
* `defaultValue` paths should end with ':'.
* `defaultValue` can have multiple paths, there should be a ':' between two paths.
* `extensions` must not have '.'.
* `extensions` should end with ':' , also have ':' between two extensions.
eg. /sdcard:/mnt:

### License
    Copyright (C) 2024 by Foysal Tech

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
