import SwiftUI
struct nav_drawer_header: View {
    
    var body: some View {
        VStack
        {
            Text("")
                .frame(minWidth:0,maxWidth:.infinity)
                .overlay(Image("ic_nav_header")
                    .padding(10))
                .padding(16)
                .font(.system(size: 20))
                .foregroundColor(Color(.gray))
                .alignmentGuide(.bottom) { _ in 0 }
            Text("Current Book Name")
                .frame(minWidth:0,maxWidth:.infinity)
                .overlay(Image("ic_arrow_drop_down_white_24dp"))
                .padding(.leading,10)
                .padding(.leading,10)
                .padding(5)
                .font(.system(size: 16))
                .foregroundColor(Color(.gray))
                .truncationMode(.tail)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:100,idealHeight:100)
        .background(Color(red:0.18039216,green:0.49019608,blue:0.19607843,opacity:1.0))}}

struct nav_drawer_header_Previews: PreviewProvider {
    static var previews: some View {
        nav_drawer_header()
    }
}
