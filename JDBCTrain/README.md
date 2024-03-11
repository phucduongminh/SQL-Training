#  Install JDK and Programming Editor
Before you proceed, I shall assume that you are familiar with Java Programming and have installed the followings:

JDK (Read "How to install JDK and Get Started").
A programming text editor, such as Sublime Text, Atom.
#  Create a Directory to Keep all your Works
I shall assume that you have created a directory called "c:\myWebProject" (for Windows) or "~/myWebProject" (for macOS) in your earlier exercises. Do it otherwise.

This step is important; otherwise, you will be out-of-sync with this article and may not be able to find your files later.

#  Install MySQL JDBC DRIVER (IMPORTANT - Don't MISS This Step!)
You need to install an appropriate JDBC (Java Database Connectivity) driver to run your Java database programs. The MySQL's JDBC driver is called "MySQL Connector/J" and is available at MySQL mother site.

For Windows

Download the "latest" MySQL JDBC driver from http://dev.mysql.com/downloads ⇒ "Connector/J" ⇒ Connector/J 8.03.{xx}, where {xx} is the latest update number ⇒ In "Select Operating System", choose "Platform Independent" ⇒ ZIP Archive (e.g., "mysql-connector-j-8.3.{xx}.zip" ⇒ "No thanks, just start my download".
UNZIP (right-click and extract all) the download file into your project directory "C:\myWebProject".
Open the unzipped folder. Look for the JAR file "mysql-connector-j-8.3.{xx}.jar".
The Absolute Full-path Filename for this JAR file is "C:\myWebProject\mysql-connector-j-3.0.{xx}\mysql-connector-j-8.3.{xx}.jar". Take note of this super-long filename that you will need later. COPY and SAVE in a scratch pad so that you can retrieve later

# Compile and Run CMD
javac Filename.java 
java -cp .\mysql-connector-j-8.3.0\mysql-connector-j-8.3.0.jar Filename.java