package com.unialfa.base.business.estado.resources.interfaces;

import com.unialfa.base.business.estado.resources.plus.EstadoDeleteAllResource;
import com.unialfa.base.business.estado.resources.plus.EstadoFindAllResource;
import com.unialfa.base.business.estado.resources.plus.EstadoFindByIdResource;
import com.unialfa.base.business.estado.resources.plus.EstadoGetServiceResource;
import com.unialfa.base.business.estado.resources.plus.EstadoSaveAllResource;

public interface IEstadoResource extends EstadoDeleteAllResource,
                                         EstadoFindAllResource,
                                         EstadoFindByIdResource,
                                         EstadoGetServiceResource,
                                         EstadoSaveAllResource {

}
