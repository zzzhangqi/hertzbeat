import { Component, Inject, OnInit } from '@angular/core';
import { I18NService } from '@core';
import { ALAIN_I18N_TOKEN } from '@delon/theme';
import { NzModalService } from 'ng-zorro-antd/modal';
import { NzNotificationService } from 'ng-zorro-antd/notification';
import { NzTableQueryParams } from 'ng-zorro-antd/table';
import { Custom } from 'src/app/pojo/Custom';
import { CustomService } from 'src/app/service/custom.service';

@Component({
  selector: 'app-setting-custom',
  templateUrl: './custom.component.html'
})
export class CustomComponent implements OnInit {
  constructor(
    private notifySvc: NzNotificationService,
    private modal: NzModalService,
    private customService: CustomService,
    @Inject(ALAIN_I18N_TOKEN) private i18nSvc: I18NService
  ) {}
  // 变量定义
  pageIndex: number = 1;
  pageSize: number = 8;
  total: number = 0;
  customs!: Custom[];
  tableLoading: boolean = false;
  search: string | undefined;
  checkedCustomIds = new Set<number>();
  ngOnInit(): void {
    this.loadCustomTable();
  }

  sync(): void {
    this.loadCustomTable();
  }
  loadCustomTable() {
    this.tableLoading = true;
    let tagsInit$ = this.customService.loadCustoms(this.search, 1, this.pageIndex - 1, this.pageSize).subscribe(
      message => {
        this.tableLoading = false;
        this.checkedAll = false;
        this.checkedCustomIds.clear();
        if (message.code === 0) {
          let page = message.data;
          this.customs = page.content;
          this.pageIndex = page.number + 1;
          this.total = page.totalElements;
        } else {
          console.warn(message.msg);
        }
        tagsInit$.unsubscribe();
      },
      error => {
        this.tableLoading = false;
        tagsInit$.unsubscribe();
        console.error(error.msg);
      }
    );
  }
  addCustomMonitor() {
    console.log('add');
  }
  deleteCustomMonitor() {
    console.log('delete');
  }
  searchMonitor() {
    console.log('search');
  }

  onTableCustomChange(params: NzTableQueryParams) {
    const { pageSize, pageIndex, sort, filter } = params;
    this.pageIndex = pageIndex;
    this.pageSize = pageSize;
    this.loadCustomTable();
  }
  checkedAll: boolean = false;
  onAllChecked(checked: boolean) {
    if (checked) {
      // this.customs.forEach(monitor => this.checkedCustomIds.add(monitor.id));
    } else {
      this.checkedCustomIds.clear();
    }
  }
}
