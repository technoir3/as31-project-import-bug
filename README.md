Android Studio 3.1 RC2 resets project settings to default during import.

Steps to reproduce:
1. Clone this repository
2. Open project in Android Studio 3.1 RC2
3. Run `git status` to see modified files:

```
On branch master
Changes not staged for commit:
	modified:   .idea/codeStyles/Project.xml
	deleted:    .idea/codeStyles/codeStyleConfig.xml
	deleted:    .idea/inspectionProfiles/Project_Default.xml
	modified:   .idea/misc.xml
```
