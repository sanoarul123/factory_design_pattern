package com.factorydesignpattern.demo.repository;

import com.factorydesignpattern.demo.entity.Transaction;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class TransactionRepository implements JpaRepository<Transaction, Long> {


    @Override
    public void flush() {

    }

    @Override
    public <S extends Transaction> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Transaction> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Transaction> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Transaction getOne(Long aLong) {
        return null;
    }

    @Override
    public Transaction getById(Long aLong) {
        return null;
    }

    @Override
    public Transaction getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Transaction> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Transaction> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Transaction> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Transaction> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Transaction> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Transaction> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Transaction, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Transaction> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Transaction> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Transaction> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Transaction> findAll() {
        return List.of();
    }

    @Override
    public List<Transaction> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Transaction entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Transaction> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Transaction> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Transaction> findAll(Pageable pageable) {
        return null;
    }
}
