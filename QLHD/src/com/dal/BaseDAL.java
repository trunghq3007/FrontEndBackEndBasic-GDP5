package com.dal;

import java.util.List;

public interface BaseDAL<T> {
    //
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: list all object T
     * Version 1.0
     * @return
     */
    List<T> getAll();
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param code
     * @return
     */
    T getByCode(String code,String pass);
    
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int insert(T object);
    
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int update(T object);
    
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int delete(String code);
    
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param sequenceFillter
     * @return
     */
    List<T> fillter(String sequenceFillter);
    
}