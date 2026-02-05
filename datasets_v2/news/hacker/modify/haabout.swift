import SwiftUI
struct haabout: View {
    
    var body: some View {
        VStack
        {
            VStack
            {
                Text("HN")
                    .font(.system(size: 80))
                    .foregroundColor(Color(red:0.4745098,green:0.4745098,blue:0.4745098,opacity:1.0))
                Text("by Creative Pragmatics")
                    .padding(.top,8)
                    .font(.system(size: 22))
                    .foregroundColor(Color(red:0.4745098,green:0.4745098,blue:0.4745098,opacity:1.0))
                Text("")
                    .padding(.top,8)
                    .font(.system(size: 22))
                    .foregroundColor(Color(red:0.4745098,green:0.4745098,blue:0.4745098,opacity:1.0))
                Text("")
                    .padding(.top,50)
                    .font(.system(size: 16))
                    .foregroundColor(Color(red:0.4745098,green:0.4745098,blue:0.4745098,opacity:1.0))
            }
            .background(Color(red:1.0,green:0.92941177,blue:0.85882354,opacity:1.0))
        }}}

struct haabout_Previews: PreviewProvider {
    static var previews: some View {
        haabout()
    }
}
