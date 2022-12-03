import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Custom } from '../pojo/Custom';
import { Message } from '../pojo/Message';
import { Page } from '../pojo/Page';

const uri = '/custom/monitors/';

@Injectable({
  providedIn: 'root'
})
export class CustomService {
  constructor(private http: HttpClient) {}

  public loadCustoms(
    search: string | undefined,
    type: number | undefined,
    pageIndex: number,
    pageSize: number
  ): Observable<Message<Page<Custom>>> {
    pageIndex = pageIndex ? pageIndex : 0;
    pageSize = pageSize ? pageSize : 8;
    // 注意HttpParams是不可变对象 需要保存set后返回的对象为最新对象
    let httpParams = new HttpParams();
    httpParams = httpParams.appendAll({
      pageIndex: pageIndex,
      pageSize: pageSize
    });
    if (type != undefined) {
      httpParams = httpParams.append('type', type);
    }
    if (search != undefined && search != '' && search.trim() != '') {
      httpParams = httpParams.append('search', search.trim());
    }
    const options = { params: httpParams };
    return this.http.get<Message<Page<Custom>>>(uri, options);
  }
}
