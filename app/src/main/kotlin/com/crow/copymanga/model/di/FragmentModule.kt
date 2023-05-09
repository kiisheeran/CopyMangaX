package com.crow.copymanga.model.di

import androidx.fragment.app.Fragment
import com.crow.base.copymanga.entity.Fragments
import com.crow.module_book.ui.fragment.BookComicFragment
import com.crow.module_book.ui.fragment.BookNovelFragment
import com.crow.module_main.ui.fragment.AboutAuthorFragment
import com.crow.module_main.ui.fragment.ContainerFragment
import com.crow.module_main.ui.fragment.SettingsFragment
import com.crow.module_user.ui.fragment.UserBottomSheetFragment
import com.crow.module_user.ui.fragment.UserIconFragment
import com.crow.module_user.ui.fragment.UserLoginFragment
import com.crow.module_user.ui.fragment.UserRegFragment
import com.crow.module_user.ui.fragment.UserUpdateInfoFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.androidx.fragment.dsl.fragment
import org.koin.core.qualifier.named
import org.koin.dsl.module

/*************************
 * @Machine: RedmiBook Pro 15 Win11
 * @Path: app/src/main/kotlin/com/crow/copymanga/di
 * @Time: 2023/4/11 13:15
 * @Author: CrowForKotlin
 * @Description: FragmentModule
 * @formatter:on
 **************************/
val fragmentModule = module {
    fragment<BottomSheetDialogFragment>(named(Fragments.User)) { UserBottomSheetFragment() }
    fragment<Fragment>(named(Fragments.Container)) { ContainerFragment() }
    fragment<Fragment>(named(Fragments.UserInfo)) { UserUpdateInfoFragment() }
    fragment<Fragment>(named(Fragments.Login)) { UserLoginFragment() }
    fragment<Fragment>(named(Fragments.Reg)) { UserRegFragment() }
    fragment<Fragment>(named(Fragments.Icon)) { UserIconFragment() }
    fragment<Fragment>(named(Fragments.About)) { AboutAuthorFragment() }
    fragment<Fragment>(named(Fragments.Settings)) { SettingsFragment() }
    fragment<Fragment>(named(Fragments.BookComicInfo)) { BookComicFragment() }
    fragment<Fragment>(named(Fragments.BookNovelInfo)) { BookNovelFragment() }
}