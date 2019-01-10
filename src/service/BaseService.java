package service;

import java.util.List;

public interface BaseService<T> {
	/**
     * Create by: pvhao - CMC
     * Create date: Jan 3, 2019
     * Modifier: pvhao
     * Modified date: Jan 3, 2019
     * Description: get list of object
     * Version 1.0
     * @return
     */
    List<T> getAll();
    
    
    /**
     * Create by: pvhao- CMC
     * Create date: Jan 3, 2019
     * Modifier: admin
     * Modified date: Jan 3, 2019
     * Description: create new object
     * Version 1.0
     * @param object
     * @return
     */
    boolean insert(T object);
    
    
    /**
    * Create by: haopham - CMC
    * Create date: Jan 3, 2019
    * Modifier: haopham
    * Modified date: Jan 3, 2019
    * Description: ....
    * Version 1.0
    * @param code
    * @return
    */
    T getByCode(String code);
    
    
    
    /**
    * Create by: haopham - CMC
    * Create date: Jan 3, 2019
    * Modifier: haopham
    * Modified date: Jan 3, 2019
    * Description: ....
    * Version 1.0
    * @param object
    * @return
    */
    boolean update(T object);
    
    
    
    /**
    * Create by: haopham - CMC
    * Create date: Jan 3, 2019
    * Modifier: haopham
    * Modified date: Jan 3, 2019
    * Description: ....
    * Version 1.0
    * @param code
    * @return
    */
    int delete(String code);
}
