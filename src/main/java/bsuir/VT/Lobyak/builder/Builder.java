package bsuir.VT.Lobyak.builder;

import bsuir.VT.Lobyak.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
