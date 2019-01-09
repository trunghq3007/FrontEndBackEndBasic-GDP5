package service;

import java.util.List;

abstract class BaseService<T> {

	abstract boolean insert();

	abstract boolean update();

	abstract boolean delete();

	abstract List<T> getAll();

	abstract T findUser(String code);

	abstract List<T> filter(String sequenceCharacter);

}
