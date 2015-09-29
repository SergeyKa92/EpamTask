package Notebook;

import java.util.ArrayList;

/**
 * Creating a new class, which has methods of adding/viewing/deleting/editing notes
 */
public class Notebook {
    private ArrayList<WriteToNotebook> notebook;

    /**
     * Initialization of class object
     */
    public Notebook() {
        notebook = new ArrayList<WriteToNotebook>();
    }

    /**
     * This method adds a string to notebook
     * @param str is what is being added
     */
    public void addNewRecord(String str) {
        notebook.add(new WriteToNotebook(str));
    }

    /**
     * This method allows to edit a note by it's index
     * @param k - this is the index of a note in array
     * @param s - this with what you want to replace a note of index k
     */
    public void edit(int k, String s) {
        WriteToNotebook note = new WriteToNotebook(s);
        notebook.set(k - 1, note);
    }

    /**
     * This method allows to see all notes among with their indexes
     */
    public void printNotes() {
        for (int i = 0; i < notebook.size(); i++) {
            int k = i + 1;
            System.out.println(k + " " + notebook.get(i).getNote());
        }}

    /**
     * This method alows to delete a note by it's index
     * @param k - is the index of a note starting from 1.
     */
    public void delete(int k) {
        notebook.remove(k - 1);
    }

    public static void main(String[] args){
        Notebook book=new Notebook();
        book.addNewRecord("Buy a drink");
        book.addNewRecord("Buy some eggs");
        book.addNewRecord("Buy Marmeladdka");
        book.edit(1,"Buy vodka for son instead");
        book.delete(1);// Vodka for kid is a bad idea so let's remove this note
        book.printNotes();
}}

