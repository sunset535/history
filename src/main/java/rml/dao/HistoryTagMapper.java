package rml.dao;

import java.util.List;

import rml.model.HistoryTag;

public interface HistoryTagMapper {

    int insert(HistoryTag tag);

    List<HistoryTag> getAll();

}
