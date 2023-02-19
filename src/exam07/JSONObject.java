package exam07;

public interface JSONObject {
    JSONObject getJSONObject(String data);

    Object getString(String name);

    Object getInt(String price);

    void put(String data, JSONObject jsonObject);

    void put(String status, String success);

    void put(String no, int no1);

    JSONArray getJSONArray(String data);
}
