# Rust Java JNA Example

This is an example of creating a dynamic library in Rust that exposes a [C ABI](https://en.wikipedia.org/wiki/Application_binary_interface) and called via [JNA](https://en.wikipedia.org/wiki/Java_Native_Access).

```
git clone https://github.com/seanjensengrey/rust-jna-example.git
```

## Build and Run Example

```
cd rust-jna-example
mvn compile
rustc treble.rs
mvn exec:java -Dexec.mainClass="rustjna.Treble"
```

To install build dependencies on a Mac via [Homebrew](http://brew.sh/)

```
brew install maven
brew install multirust
multirust update
multirust default stable
```

## Output


```
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building TrebleJna 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:1.4.0:java (default-cli) @ test ---
trebling: 10 30
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.497 s
[INFO] Finished at: 2016-02-19T12:46:32-05:00
[INFO] Final Memory: 9M/245M
[INFO] ------------------------------------------------------------------------
```
