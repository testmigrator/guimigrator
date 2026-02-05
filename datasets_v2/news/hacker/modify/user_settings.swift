import SwiftUI
struct user_settings: View {

var body: some View {
VStack
{
Text("User")
.padding(.top,8)
.padding(.bottom,2)
.padding(.leading,15)
.font(.system(size: 22))
.foregroundColor(Color(.gray))
Text("Username")
.padding(.bottom,8)
.padding(.leading,15)
.foregroundColor(Color(red:0.19215687,green:0.1882353,blue:0.19215687,opacity:1.0))
}}}

struct user_settings_Previews: PreviewProvider {
    static var previews: some View {
        user_settings()
    }
}
