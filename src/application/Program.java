package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean sucess = new File(sourceFolderStr + "\\out").mkdir(); //criacao de novo diretorio

        System.out.println("Folder created: "+sucess);

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; //criacao do arquivo de saida

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr)))
        {
            String itemCsv = br.readLine();

            while(itemCsv != null) //leitura total do arquivo
            {
                String[] fields = itemCsv.split(",");
                //separando a string
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                //separando a string

                Product product = new Product(name, price, quantity);//construtor
                list.add(product);

                itemCsv = br.readLine();

            }//

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr)))
            {
                for(Product prod : list)
                {
                    bw.write(prod.getName() + "," + String.format("%.2f",prod.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + "Created!");

            } catch (IOException e) {
                System.out.println("Error writing file: "+e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Error writing file: "+ e.getMessage());
        }


        sc.close();

    }
}
