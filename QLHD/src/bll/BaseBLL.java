package bll;

import java.util.List;

public interface BaseBLL<T>{
	 /**
     * Create by: minhanh - CMC
     * Create date: Dec 28, 2018
     * Modifier: minhanh
     * Modified date: Dec 28, 2018
     * Description: .list all object T
     * Version 1.0
     * @return
     */
    List<T> getAll();

    /**
     * Create by: minhanh - CMC
     * Create date: Dec 28, 2018
     * Modifier: HQTrung
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @return
     */
    T getByCode(String code);

    /**
     * Create by: minhanh - CMC
     * Create date: Dec 28, 2018
     * Modifier: minhanh
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int insert(T object);

    /**
     * Create by: minhanh - CMC
     * Create date: Dec 28, 2018
     * Modifier: minhanh
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int update(T object);

    /**
     * Create by: minhanh - CMC
     * Create date: Dec 28, 2018
     * Modifier: minhanh
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int delete(String code);

    /**
     * Create by: minhanh - CMC
     * Create date: Dec 28, 2018
     * Modifier: minhanh
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param sequenceFilter
     * @return
     */
    List<T> fillter(String sequenceFilter);
}
