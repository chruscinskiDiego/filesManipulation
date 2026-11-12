# Resumo de produtos a partir de CSV

Exercício em Java que lê produtos de um arquivo CSV e escreve um resumo com o valor total de cada item.

## Fluxo

1. Recebe o caminho do arquivo pelo terminal.
2. Lê linhas no formato nome,preço,quantidade, sem cabeçalho.
3. Calcula preço × quantidade.
4. Gera um arquivo summary.csv na pasta out.

## Exemplo de entrada

```csv
Teclado,120.00,2
Mouse,60.00,3
```

## Executar

Com um JDK instalado:

```bash
javac -encoding UTF-8 -d classes src/application/Program.java src/entities/Product.java
java -cp classes application.Program
```

## Conceitos praticados

Leitura e escrita de arquivos, try-with-resources, listas e modelagem de produtos.

## Limitações conhecidas

A montagem do caminho de saída usa separadores específicos do Windows. Em Linux/macOS, revise esse trecho antes de usar. O parser é simples e não trata campos CSV com vírgulas escapadas ou linhas inválidas.
