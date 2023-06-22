cd C:\Users\admin\IdeaProjects\kodilla-course\build\libs
del *.jar
cd C:\Users\admin\IdeaProjects\kodilla-course
call gradlew build
cd C:\Users\admin\IdeaProjects\kodilla-course\build\libs
IF EXISTS *.jar copy *.jar C:\project\ ELSE echo compilation error