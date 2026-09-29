package model;

import com.fasterxml.jackson.core.type.TypeReference;

public class Reference<T extends Model> {
    private final Object url;
    private final Class<T> modelType;
    private final TypeReference<T> typeReference;

    public Reference(Object url, Class<T> modelType, TypeReference<T> typeReference) {
        this.url = url;
        this.modelType = modelType;
        this.typeReference = typeReference;
    }

    public Object getUrl() {
        return url;
    }

    public Class<T> getModelType() {
        return modelType;
    }

    public TypeReference<T> getTypeReference() {
        return typeReference;
    }
}
