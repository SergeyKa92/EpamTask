package Notebook;

/**
 * Created by —ергей on 27.09.2015.
 */

public class WriteToNotebook {

    /**
     * —трока, значение которой есть запись.
     */
    private String note;
    /**
     *  онструктор класса, который записывает
     * @param str переменную в класс.
     */
    WriteToNotebook(String str){

        note = str;
    }
    /**
     *
     * @return note возращает запись
     */
    public String getNote() {
        return note; }

}