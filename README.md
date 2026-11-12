# Product summaries from CSV files

Java exercise that reads product records from a CSV file and writes a summary containing each item's total value.

## Workflow

1. Reads a file path from the terminal.
2. Parses headerless rows in name,price,quantity format.
3. Calculates price × quantity.
4. Writes summary.csv to the out directory.

## Sample input

```csv
Teclado,120.00,2
Mouse,60.00,3
```

## Run locally

With a JDK installed:

```bash
javac -encoding UTF-8 -d classes src/application/Program.java src/entities/Product.java
java -cp classes application.Program
```

## Concepts practiced

File input/output, try-with-resources, lists and product modeling.

## Known limitations

The output path uses Windows-specific separators. Review this code before running on Linux or macOS. The simple parser does not support escaped commas or malformed rows.
