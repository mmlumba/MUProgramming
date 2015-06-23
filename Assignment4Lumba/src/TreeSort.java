import java.util.*;



public class TreeSort {

public static void main(String[] args){



String jay ="Whether I shall turn out to be the hero of my own life, " +

"or whether that station will be held by anybody else, " +

"these pages must show. To begin my life with the beginning of my life, " +

"I record that I was born (as I have been informed and believe) " +

"on a Friday, at twelve o'clock at night. It was remarked that " +

"the clock began to strike, and I began to cry, simultaneously.";

//The Paragraph that is going into the String is held by Jay

String[] words = jay.split("\\s+");

//the array that will take in the paragraph and split breakdown the words

ArrayList<String> newWords = new ArrayList<String>(100);


for (int i = 0; i < words.length; i++){

words[i]=words[i].replaceAll("\\W", "");

newWords.add(words[i]);

}

//it loops through the array words

//replaces every punctuation with a space

//then adds the array words into arraylist newWords


TreeSet<String> treeSet = new TreeSet<String>(newWords);

//use TreeSet to sort newWords


String result = treeSet.toString();

String[] answer = result.split(" ");

for(int i =0; i < answer.length; i++)

System.out.println(answer[i]);

System.out.println("the tree set is "+treeSet.size());


}

}
