package com.qs.contact.mvp.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.qs.arm.base.BaseHolder;
import com.qs.arm.di.component.AppComponent;
import com.qs.arm.utils.ArmsUtils;
import com.qs.contact.R;
import com.qs.contact.mvp.model.entity.Contact;
import com.qs.contact.mvp.model.entity.ContactBean;

import butterknife.BindView;
import io.reactivex.Observable;

/**
 * @author 华清松
 * @since 列表人列表项视图
 */
public class ContactItemHolder extends BaseHolder<ContactBean> {

    private AppComponent mAppComponent;
    private Context context;

    @BindView(R.id.name)
    TextView mName;

    public ContactItemHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();
        mAppComponent = ArmsUtils.obtainAppComponentFromContext(context);
    }

    @Override
    public void setData(ContactBean data, int position) {
        Contact contact = (Contact) data;

        Observable.just(contact.getContactName()).subscribe(s -> mName.setText(s));
    }

    @Override
    protected void onRelease() {
        super.onRelease();

    }
}
