Download graalvm java JDK
bash <(curl -sL https://get.graalvm.org/jdk) -c 'native-image'
#Set java home to graavlm jdk
export JAVA_HOME=<path_to_graalvm>/graalvm-ce-java17-22.3.0/Contents/Home
#Compile the project
mvn native:compile -Pnative
to build both ui and backend run  ./build.sh 
to run the project 