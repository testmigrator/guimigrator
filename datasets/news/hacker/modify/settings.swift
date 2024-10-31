import SwiftUI
struct settings: View {
    
    var body: some View {
        VStack
        {
            HStack
            {
                Image("back")
                    .padding(.top,8)
                    .padding(.bottom,8)
                    .padding(.trailing,12)
                Spacer()
                Text("Settings")
                    .font(.system(size: 24))
                    .foregroundColor(Color(.white))
                Spacer()
            }
            .frame(minHeight:48,idealHeight:48)
            .background(Image("actionbar_bg_orange").resizable())
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .listStyle(PlainListStyle())
            .background(Color(red:1.0,green:0.92941177,blue:0.85882354,opacity:1.0))
        }}}

struct settings_Previews: PreviewProvider {
    static var previews: some View {
        settings()
    }
}
