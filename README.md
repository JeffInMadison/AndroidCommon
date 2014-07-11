AndroidCommon
=============

Android library to build @aar that I can include in projects vs copy pasting all the time


The problem
=============
The code to get metadata from manifest, create an image from a view, store data to the shared preferences is the same for every project. I usually copy/paste the code when I start a new project and I have the problem that if I add something useful to one library it only gets carried forward as I use the last project I worked on's version to create the new one.

The options
=============
- I can keep copy pasting.
- I can version the output and use Android Studio's import jar/aar to add it to projects
- I can add this project as a git submodule to my projects. Then I can add/edit code as needed. 
