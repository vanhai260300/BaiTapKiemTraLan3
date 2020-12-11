package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    RecyclerView recycleuudai, recyclecapnhat,recycle_lover;
    itemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setOnClickListener(view -> {
            Intent intent = new Intent(Home.this, NotificationActivity.class);
            startActivity(intent);
        });

        List<item> uudailist = new ArrayList<>();
        uudailist.add(new item("Taste of Xmas - Chạm giáng sinh","Không khí se lạnh len lỏi khắp ngõ ngách phố phường báo hiệu một mùa Giáng sinh nữa lại về. Giáng sinh năm nay có thể sẽ khác hơn, đặc biệt hơn sau một năm đặc biệt.\n" +
                "\n" +
                "Thế nhưng, năm nay tại The Coffee House, “vị\" Giáng sinh mà bạn yêu thích, mong chờ vẫn sẽ vẹn nguyên và đong đầy.  Tất cả đều sống động qua từng khoảnh khắc, từng ngóc ngách quanh chiếc bàn cà phê ấm cúng. Giáng sinh năm nay, các Barista của The Coffee House đã ấp ủ cho mùa ấm áp 2 hương vị thượng hạng được gói ghém cẩn thận trong phiên bản giới hạn:\n" +
                "\n" +
                "\uD83C\uDF84Merry Choco (Choco lúa mạch): hương vị để bạn chiều chuộng bản thân - mang vị ngọt hoàn hảo được cân chỉnh hợp lý từ sô cô la và lúa mạch thơm lừng, không quá gắt.\n" +
                "\n" +
                "\uD83C\uDF84Merry Coffee (Cà phê lúa mạch): vị cà phê đắng nhẹ quen thuộc, nhưng lại thơm và đặc biệt hơn khi có lúa mạch hoà quyện. Hương vị tỉnh táo cho những ai yêu vị cà phê không quá đắng, thơm béo và ngọt ngào.\n" +
                "\n" +
                "2 hương vị, 4 phiên bản nóng - lạnh và tất cả “vị\" Giáng sinh mà bạn mong đợi đã có mặt tại các cửa hàng The Coffee House từ ngày 24/11.\n" +
                "\n" +
                "Hãy cùng người thương ghé đến The Coffee House để chạm và tận hưởng hương vị mùa lễ hội nhé!","Chi tiết",R.drawable.imgd2));
        uudailist.add(new item("CÂU CHUYỆN SƠ RI THE COFFEE HOUSE \"100% TỰ NHIÊN - TƯƠI NGON MÁT LẠNH\"","Chẳng phải tự nhiên The Coffee House chọn Sơ ri Gò Công - Tiền Giang chứ không phải Sơ ri ở những vùng đất khác để tạo nên bộ đôi Trà Sơ ri Thanh long & Yakult Sơ ri Thanh long trứ danh. Vậy lý do tại sao?\n" +
                "\n" +
                "Câu chuyện về Sơ ri\n" +
                "\n" +
                "Sơ ri là loại trái cây quen thuộc với người Việt. Việc thưởng thức hương vị chua ngọt của loại quả này là sở thích của nhiều người. Vậy nhưng quả Sơ ri - nông sản Việt 100% thường bị nhầm thành trái Cherry nhập khẩu.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Sơ ri Gò Công - Tiền Giang\n" +
                "\n" +
                "Quả Sơ ri được trồng nhiều ở Nam Bộ, đặc biệt ở Gò Công - Tiền Giang. Thổ nhưỡng ở vùng đất Gò Công được cho là phù hợp với quả Sơ ri nhất. Những quả Sơ ri được trồng tại vùng đất này có da căng bóng, thịt chắc và vị chua ngọt tự nhiên.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Theo USDA (United States Department of Agriculture) - Bộ Nông nghiệp Hoa Kỳ, nhu cầu vitamin C trong một ngày của một người trưởng thành khoảng 50mg, như vậy mỗi ngày một người chỉ cần ăn 4 quả sơ ri chua hoặc 5 quả sơ ri ngọt là có dư nhu cầu vitamin C cho cơ thể.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Vượt chặng đường xa hàng nghìn kilomet, những quả Sơ ri chín mọng nước được lựa chọn kĩ càng từ các nông hộ đã \"cập bến\" The Coffee House. Kết hợp với những nguyên liệu quen thuộc, qua bàn tay sáng tạo của barista - The Coffee House mang đến bạn 2 phiên bản:\n" +
                "\n" +
                "- Trà Sơ ri Thanh long trân châu trắng dai giòn, tươi mát.\n" +
                "- Yakult Sơ ri Thanh Long \"healthy\".\n" +
                "\n","Chi tiết",R.drawable.imgd3));
        uudailist.add(new item("CHƯƠNG TRÌNH KHÁCH HÀNG THÂN THIẾT: BẠN CÓ THÊM 3 THÁNG ĐỔI BEAN NHẬN ƯU ĐÃI","Chương trình khách hàng thân thiết - The Coffee House Rewards cập nhật thêm nhiều ưu đãi hấp dẫn, đa tiện ích: giải trí, mua sắm, ăn uống,... Đặc biệt, kéo dài thời gian đổi BEAN thêm 3 tháng. Kiểm tra mục Rewards và tận hưởng ưu đãi đặc quyền ngay hôm nay.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ƯU ĐÃI ĐẶC QUYỀN\n" +
                "\n" +
                "Nỗ lực mang đến trải nghiệm tốt nhất cho khách hàng, The Coffee House Rewards liên tục cập nhật ưu đãi để khách hàng có thể thoải mái sử dụng BEAN đổi lấy trải nghiệm mới mẻ.\n" +
                "\n" +
                "Từ những hạt BEAN tích luỹ, giờ đây khách hàng có thêm nhiều lựa chọn quy đổi để sử dụng các dịch vụ giải trí, mua sắm, ăn uống từ những đối tác hàng đầu trên thị trường của The Coffee House Rewards:\n" +
                "\n" +
                "- Ăn uống: San Fu Lou, Gogi House, Kichi Kichi, Sumo BBQ\n" +
                "- Giải trí: CGV, My Kingdom, Kiz Citi, Citigym\n" +
                "- Mua sắm: Tiki, Marc, Bách Hoá Xanh, Circle-K, Family Mart, Klever Fruit, Viettel, Vinafone, Mobifone\n" +
                "- Đặc quyền: thưởng thức thức uống mới, thức uống best-seller tại The Coffee House \n" +
                "\n" +
                "\n" +
                "GIA HẠN THỜI GIAN ĐỔI BEAN\n" +
                "\n" +
                "The Coffee House hiểu rằng chúng ta đã trải qua một khoảng thời gian biến động vì COVID-19. Việc này có thể ảnh hưởng trực tiếp đến thói quen sử dụng dịch vụ, hoạt động chi tiêu của khách hàng.\n" +
                "\n" +
                "Để đảm bảo quyền lợi và trải nghiệm tốt nhất cho khách hàng, The Coffee House quyết định gia hạn thời gian đổi BEAN kéo dài thêm 3 tháng. Điều này có nghĩa là, số BEAN khách hàng tích luỹ sẽ được dùng đến ngày 31/12/2020.\n" +
                "\n KIỂM TRA BEAN SẮP HẾT HẠN NHƯ THẾ NÀO?\n" +
                "\n" +
                "Để kiểm tra số BEAN sắp hết hạn, bạn thực hiện 3 bước sau:\n" +
                "\n" +
                "\n" +
                "\n" +
                "SAU 31/12/2020 BEAN SẼ ĐƯỢC TÍNH NHƯ THẾ NÀO?\n" +
                "\n" +
                "Theo chính sách của The Coffee House Rewards, BEAN tích luỹ sẽ hết hạn từ Quý 4 liền kề. Hạn dùng BEAN sẽ được tính như ví dụ bên dưới:\n" +
                "\n" +
                "Trong Quý 1 (từ ngày 1/1 đến hết ngày 31/3), khách hàng A tích luỹ được 1000 BEAN. Ngày 1/10 là ngày xét số BEAN trong Quý 1 của khách hàng A.\n" +
                "\n" +
                "Nếu trong Quý 1 khách hàng chỉ đổi 890 BEAN, còn 110 BEAN chưa sử dụng, ngày 1/10 số BEAN chưa sử dụng của khách hàng sẽ hết hạn.\n" +
                "\n" +
                "Từ ngày 1/1/2021, BEAN tích luỹ trong Quý 1 và Quý 2/2020 sẽ hết hạn. BEAN bị huỷ không ảnh hưởng đến hạng của khách hàng. Khách hàng không bị giảm hạng, không bị ảnh hưởng tới quá trình tích luỹ thăng hạng.\n" +
                "\n" +
                "Chờ gì nữa, check mục Rewards và đổi ưu đãi ngay hôm nay nhé!","Chi tiết",R.drawable.imgd4));
        uudailist.add(new item("The Coffee House đồng hành cùng bạn \"Go Green\"!","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ... Thế giới này trở nên xinh đẹp hơn là nhờ có bạn - bạn nữ ơi. Và tuần này, The Coffee House sẽ dành trọn cho bạn không gian ấm áp xịn sò, thức uống ngọt ngào - tỉnh táo - healthy, đặc biệt cùng \"7 ngày size L giá M\".\n" +
                "\n" +
                "Bạn chỉ việc đến The Coffee House thưởng thức món ngon, rôm rả chuyện trò. Cuộc hẹn của bạn sẽ được The Coffee House lo! \n" +
                "\n" +
                "- Thời gian diễn ra chương trình: 19/10/2020 - 25/10/2020\n" +
                "- Ưu đãi áp dụng Free Upsize từ size M lên size L.\n" +
                "- Ưu đãi áp dụng cho toàn bộ menu nước The Coffee House trừ: Dòng cà phê máy, đồ uống nóng, Macha Latte và Socola Latte.\n" +
                "- Ưu đãi áp dụng tại tất cả cửa hàng The Coffee House trên toàn quốc.\n" +
                "- Ưu đãi không áp dụng song song các chương trình khuyến mãi khác.\n" +
                "- Số lượng ưu đãi có hạn nên chương trình có thể kết thúc sớm hơn dự kiến.","Chi tiết",R.drawable.imgd1));
        uudailist.add(new item("TASTE OF XMAS - CHẠM VỊ GIÁNG SINH","Không khí se lạnh len lỏi khắp ngõ ngách phố phường báo hiệu một mùa Giáng sinh nữa lại về. Giáng sinh năm nay có thể sẽ khác hơn, đặc biệt hơn sau một năm đặc biệt.\n" +
                "\n" +
                "Thế nhưng, năm nay tại The Coffee House, “vị\" Giáng sinh mà bạn yêu thích, mong chờ vẫn sẽ vẹn nguyên và đong đầy.  Tất cả đều sống động qua từng khoảnh khắc, từng ngóc ngách quanh chiếc bàn cà phê ấm cúng. Giáng sinh năm nay, các Barista của The Coffee House đã ấp ủ cho mùa ấm áp 2 hương vị thượng hạng được gói ghém cẩn thận trong phiên bản giới hạn:\n" +
                "\n" +
                "\uD83C\uDF84Merry Choco (Choco lúa mạch): hương vị để bạn chiều chuộng bản thân - mang vị ngọt hoàn hảo được cân chỉnh hợp lý từ sô cô la và lúa mạch thơm lừng, không quá gắt.\n" +
                "\n" +
                "\uD83C\uDF84Merry Coffee (Cà phê lúa mạch): vị cà phê đắng nhẹ quen thuộc, nhưng lại thơm và đặc biệt hơn khi có lúa mạch hoà quyện. Hương vị tỉnh táo cho những ai yêu vị cà phê không quá đắng, thơm béo và ngọt ngào.\n" +
                "\n" +
                "2 hương vị, 4 phiên bản nóng - lạnh và tất cả “vị\" Giáng sinh mà bạn mong đợi đã có mặt tại các cửa hàng The Coffee House từ ngày 24/11.\n" +
                "\n" +
                "Hãy cùng người thương ghé đến The Coffee House để chạm và tận hưởng hương vị mùa lễ hội nhé!","Chi tiết",R.drawable.imgd2));
        uudailist.add(new item("CÂU CHUYỆN SƠ RI THE COFFEE HOUSE \"100% TỰ NHIÊN - TƯƠI NGON MÁT LẠNH\"","Chẳng phải tự nhiên The Coffee House chọn Sơ ri Gò Công - Tiền Giang chứ không phải Sơ ri ở những vùng đất khác để tạo nên bộ đôi Trà Sơ ri Thanh long & Yakult Sơ ri Thanh long trứ danh. Vậy lý do tại sao?\n" +
                "\n" +
                "Câu chuyện về Sơ ri\n" +
                "\n" +
                "Sơ ri là loại trái cây quen thuộc với người Việt. Việc thưởng thức hương vị chua ngọt của loại quả này là sở thích của nhiều người. Vậy nhưng quả Sơ ri - nông sản Việt 100% thường bị nhầm thành trái Cherry nhập khẩu.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Sơ ri Gò Công - Tiền Giang\n" +
                "\n" +
                "Quả Sơ ri được trồng nhiều ở Nam Bộ, đặc biệt ở Gò Công - Tiền Giang. Thổ nhưỡng ở vùng đất Gò Công được cho là phù hợp với quả Sơ ri nhất. Những quả Sơ ri được trồng tại vùng đất này có da căng bóng, thịt chắc và vị chua ngọt tự nhiên.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Theo USDA (United States Department of Agriculture) - Bộ Nông nghiệp Hoa Kỳ, nhu cầu vitamin C trong một ngày của một người trưởng thành khoảng 50mg, như vậy mỗi ngày một người chỉ cần ăn 4 quả sơ ri chua hoặc 5 quả sơ ri ngọt là có dư nhu cầu vitamin C cho cơ thể.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Vượt chặng đường xa hàng nghìn kilomet, những quả Sơ ri chín mọng nước được lựa chọn kĩ càng từ các nông hộ đã \"cập bến\" The Coffee House. Kết hợp với những nguyên liệu quen thuộc, qua bàn tay sáng tạo của barista - The Coffee House mang đến bạn 2 phiên bản:\n" +
                "\n" +
                "- Trà Sơ ri Thanh long trân châu trắng dai giòn, tươi mát.\n" +
                "- Yakult Sơ ri Thanh Long \"healthy\".\n" +
                "\n","Chi tiết",R.drawable.imgd3));
        uudailist.add(new item("CHƯƠNG TRÌNH KHÁCH HÀNG THÂN THIẾT: BẠN CÓ THÊM 3 THÁNG ĐỔI BEAN NHẬN ƯU ĐÃI","Chương trình khách hàng thân thiết - The Coffee House Rewards cập nhật thêm nhiều ưu đãi hấp dẫn, đa tiện ích: giải trí, mua sắm, ăn uống,... Đặc biệt, kéo dài thời gian đổi BEAN thêm 3 tháng. Kiểm tra mục Rewards và tận hưởng ưu đãi đặc quyền ngay hôm nay.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ƯU ĐÃI ĐẶC QUYỀN\n" +
                "\n" +
                "Nỗ lực mang đến trải nghiệm tốt nhất cho khách hàng, The Coffee House Rewards liên tục cập nhật ưu đãi để khách hàng có thể thoải mái sử dụng BEAN đổi lấy trải nghiệm mới mẻ.\n" +
                "\n" +
                "Từ những hạt BEAN tích luỹ, giờ đây khách hàng có thêm nhiều lựa chọn quy đổi để sử dụng các dịch vụ giải trí, mua sắm, ăn uống từ những đối tác hàng đầu trên thị trường của The Coffee House Rewards:\n" +
                "\n" +
                "- Ăn uống: San Fu Lou, Gogi House, Kichi Kichi, Sumo BBQ\n" +
                "- Giải trí: CGV, My Kingdom, Kiz Citi, Citigym\n" +
                "- Mua sắm: Tiki, Marc, Bách Hoá Xanh, Circle-K, Family Mart, Klever Fruit, Viettel, Vinafone, Mobifone\n" +
                "- Đặc quyền: thưởng thức thức uống mới, thức uống best-seller tại The Coffee House \n" +
                "\n" +
                "\n" +
                "GIA HẠN THỜI GIAN ĐỔI BEAN\n" +
                "\n" +
                "The Coffee House hiểu rằng chúng ta đã trải qua một khoảng thời gian biến động vì COVID-19. Việc này có thể ảnh hưởng trực tiếp đến thói quen sử dụng dịch vụ, hoạt động chi tiêu của khách hàng.\n" +
                "\n" +
                "Để đảm bảo quyền lợi và trải nghiệm tốt nhất cho khách hàng, The Coffee House quyết định gia hạn thời gian đổi BEAN kéo dài thêm 3 tháng. Điều này có nghĩa là, số BEAN khách hàng tích luỹ sẽ được dùng đến ngày 31/12/2020.\n" +
                "\n KIỂM TRA BEAN SẮP HẾT HẠN NHƯ THẾ NÀO?\n" +
                "\n" +
                "Để kiểm tra số BEAN sắp hết hạn, bạn thực hiện 3 bước sau:\n" +
                "\n" +
                "\n" +
                "\n" +
                "SAU 31/12/2020 BEAN SẼ ĐƯỢC TÍNH NHƯ THẾ NÀO?\n" +
                "\n" +
                "Theo chính sách của The Coffee House Rewards, BEAN tích luỹ sẽ hết hạn từ Quý 4 liền kề. Hạn dùng BEAN sẽ được tính như ví dụ bên dưới:\n" +
                "\n" +
                "Trong Quý 1 (từ ngày 1/1 đến hết ngày 31/3), khách hàng A tích luỹ được 1000 BEAN. Ngày 1/10 là ngày xét số BEAN trong Quý 1 của khách hàng A.\n" +
                "\n" +
                "Nếu trong Quý 1 khách hàng chỉ đổi 890 BEAN, còn 110 BEAN chưa sử dụng, ngày 1/10 số BEAN chưa sử dụng của khách hàng sẽ hết hạn.\n" +
                "\n" +
                "Từ ngày 1/1/2021, BEAN tích luỹ trong Quý 1 và Quý 2/2020 sẽ hết hạn. BEAN bị huỷ không ảnh hưởng đến hạng của khách hàng. Khách hàng không bị giảm hạng, không bị ảnh hưởng tới quá trình tích luỹ thăng hạng.\n" +
                "\n" +
                "Chờ gì nữa, check mục Rewards và đổi ưu đãi ngay hôm nay nhé!","Chi tiết",R.drawable.imgd4));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.imgd5));

        List<item> capnhatlist = new ArrayList<>();
        capnhatlist.add(new item("TASTE OF XMAS - CHẠM VỊ GIÁNG SINH","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.imgd6));
        capnhatlist.add(new item("Top 10 cửa hàng The Coffee House bạn nên trải nghiệm tại Hà Nội","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.imgd7));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.imgd8));
        capnhatlist.add(new item("The Coffee House đồng hành cùng bạn \"Go Green\"!","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.imgd9));
        capnhatlist.add(new item("KHÔNG GIAN THE COFFEE HOUSE MỚI: HIỆN ĐẠI, SANG TRỌNG VÀ ẤM ÁP","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.imgd10));

        List<item>  loverlist = new ArrayList<>();
        loverlist.add(new item("CHƯƠNG TRÌNH KHÁCH HÀNG THÂN THIẾT: BẠN CÓ THÊM 3 THÁNG ĐỔI BEAN NHẬN ƯU ĐÃI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.imgd11));
        loverlist.add(new item("CHƯƠNG TRÌNH KHÁCH HÀNG THÂN THIẾT: BẠN CÓ THÊM 3 THÁNG ĐỔI BEAN NHẬN ƯU ĐÃI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.imgd12));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_3));
        loverlist.add(new item("CÂU CHUYỆN SƠ RI THE COFFEE HOUSE \"100% TỰ NHIÊN - TƯƠI NGON MÁT LẠNH\"","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_4));
        loverlist.add(new item("KHÔNG GIAN THE COFFEE HOUSE MỚI: HIỆN ĐẠI, SANG TRỌNG VÀ ẤM ÁP","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_5));

        setRecycle_uudai(uudailist);
        setRecyclecapnhat(capnhatlist);
        setRecycle_lover(loverlist);




        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.news);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
//                        startActivity(new Intent(getApplicationContext(),Home.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),store_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
    public void setRecycle_uudai(List<item> itemList ){
        recycleuudai=findViewById(R.id.recycle_uudai);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recycleuudai.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recycleuudai.setAdapter(itemAdapter);

    }
    public void setRecyclecapnhat(List<item> itemList ){
        recyclecapnhat=findViewById(R.id.recycle_capnhat);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclecapnhat.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recyclecapnhat.setAdapter(itemAdapter);
    }
    public void setRecycle_lover(List<item> itemList ){
        recycle_lover=findViewById(R.id.recycle_lover);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recycle_lover.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recycle_lover.setAdapter(itemAdapter);
    }
}