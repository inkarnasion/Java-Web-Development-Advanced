package softuni.exodiaapp.web.service;

import softuni.exodiaapp.web.domain.models.service.DocumentServiceModel;

import java.util.List;

public interface DocumentService {

    String scheduleDocument(DocumentServiceModel documentServiceModel);

    DocumentServiceModel findDocumentById(String id);

    List<DocumentServiceModel> findAllDocumnts();

    boolean printById(String id);
}
