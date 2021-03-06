package com.coolcuy.persistence;

import java.util.List;

public interface GenericDao<T> {
	public int add(T object);
	public int delete(String element);
	public int deleteAll();
	public int update(T object);
	public T get(String element);
	public List<T> getAll();
}
