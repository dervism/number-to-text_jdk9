# number-to-text-jdk9

Run `run.sh` to test the application from the commandline:

```
$ sh run.sh 23456
[INFO] ------------------------------------------------------------------------
[INFO] --- exec-maven-plugin:1.6.0:exec (default-cli) @ number_main ---
twentythree thousand four hundred and fiftysix
[INFO] ------------------------------------------------------------------------
```

Or use maven exec-plugin inside the `number_main` module:

```
$ mvn exec:exec -Darg="123"
[INFO] ------------------------------------------------------------------------
[INFO] --- exec-maven-plugin:1.6.0:exec (default-cli) @ number_main ---
one hundred and twentythree
[INFO] ------------------------------------------------------------------------
```
