package Notebook;

/**
 * Created by ������ on 27.09.2015.
 */

public class WriteToNotebook {

    /**
     * ������, �������� ������� ���� ������.
     */
    private String note;
    /**
     * ����������� ������, ������� ����������
     * @param str ���������� � �����.
     */
    WriteToNotebook(String str){

        note = str;
    }
    /**
     *
     * @return note ��������� ������
     */
    public String getNote() {
        return note; }

}